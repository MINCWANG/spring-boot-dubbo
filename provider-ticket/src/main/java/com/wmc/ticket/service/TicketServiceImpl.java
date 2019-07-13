package com.wmc.ticket.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: WangMC
 * @date: 2019/7/13 12:33
 * @description:
 */
// 将服务发布出去
@Component
@Service
public class TicketServiceImpl implements TicketService {


    @Override
    public String getTicket() {
        return "超神学院-诸天降临";
    }
}
