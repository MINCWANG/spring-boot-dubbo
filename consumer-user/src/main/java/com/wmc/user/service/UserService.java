package com.wmc.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wmc.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author: WangMC
 * @date: 2019/7/13 13:28
 * @description:
 */
@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public void hello() {
        String ticker = ticketService.getTicket();
        System.out.println("买到了《" + ticker + "》的票");
    }

}
