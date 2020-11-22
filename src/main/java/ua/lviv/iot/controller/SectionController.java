package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Section;
import ua.lviv.iot.service.SectionService;

public class SectionController extends AbstractController<Section, Integer, SectionService> {

    public SectionController(){
        super(SectionService.class);
    }
}
