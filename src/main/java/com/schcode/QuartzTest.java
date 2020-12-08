package com.schcode;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzTest {
    //Quartz(石英)
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contet = new ClassPathXmlApplicationContext("application-jobs.xml");
//        //定义一个JobDetail(工作细节)
//        try {
//            JobDetail jobDetail = JobBuilder.newJob(HelloQuarts.class)
//            //定义name 和group 给触发器的一些属性比如名字,组名
//            .withIdentity("job1","group1")
//            //job需要传递的内容 具体job传递参数
//            .usingJobData("name","sdas")
//            .build();
//
//            //定义一个Trigger(触发)
//            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger","group1")
//            //加入 scheduler(调度器)之后立刻执行 立刻启动
//            .startNow()
//                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1)
//                            .repeatForever()).build();
//
//            //创建scheduler
//            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//
//            scheduler.scheduleJob(jobDetail,trigger);
//            //Scheduler只有在调用start()方法后,才会真正的触发trigger(即执行job)
//            scheduler.start();
//            try {
//                Thread.sleep(8000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            scheduler.shutdown();
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }

    }
}
