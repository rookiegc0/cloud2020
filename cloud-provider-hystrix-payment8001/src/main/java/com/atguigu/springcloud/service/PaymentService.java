package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2022/7/21.
 *
 * @author Chen Gao
 */
@Service
public class PaymentService {

    /**
     * 正常访问OK的方法
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池:  "+Thread.currentThread().getName()+"  paymentInfo_OK,id:  "+id+"\t"+"略略略";
    }




    public String paymentInfo_TimeOut(Integer id){

        int timeNumber = 3;
        try { TimeUnit.SECONDS.sleep(timeNumber); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"嘿嘿嘿，耗费()秒"+timeNumber;
    }
}
