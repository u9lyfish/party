package cn.michaelwang.party.controller;

import cn.michaelwang.party.domain.Player;
import cn.michaelwang.party.service.IGanDengYanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/GanDengYan")
public class GanDengYanController {
    private final IGanDengYanService service;

    @Autowired
    public GanDengYanController(IGanDengYanService service) {
        this.service = service;
    }

    public Map<String, List<Player>> addPlayer(String playerName) {
        return service.addPlayer(playerName);
    }
}