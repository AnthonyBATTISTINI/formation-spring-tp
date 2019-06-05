package com.training.springcore.service;

import com.training.springcore.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class SiteServiceImpl implements SiteService {

    private CaptorService captorService;

    public SiteServiceImpl(){}

    @Autowired
    public SiteServiceImpl(CaptorService captorService){
        System.out.println("Init SiteServiceImpl : " + this);
        this.setCaptorService(captorService);
    }

    private void setCaptorService(CaptorService captorService){
        this.captorService = captorService;
    }

    @Override
    public Site findById(String siteId) {
        System.out.println("Appel de findById : " + this);
        if (siteId == null) {
            return null;
        }

        Site site = new Site("Florange");
        site.setId(siteId);
        site.setCaptors(captorService.findBySite(siteId));
        return site;
    }
}
