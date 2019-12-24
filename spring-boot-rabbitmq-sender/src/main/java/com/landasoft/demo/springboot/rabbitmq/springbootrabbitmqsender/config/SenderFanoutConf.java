package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Fanout Exchange形式又叫广播形式,因此我们发送到路由器的消息会使得绑定到该路由器的每一个Queue接收到消息
 * 这个时候就算指定了Key,或者规则(即上文中convertAndSend方法的参数2),也会被忽略!
 * 应用场景：单发送，多接收的应用场景
 * @Date 2019/12/24 9:33
 */
@Configuration
public class SenderFanoutConf {
    public final static String FANOUTEXCHANGE="fanoutExchange";
    @Bean(name="Amessage")
    public Queue AMessage() {
        return new Queue("fanout.A",true);
    }
    @Bean(name="Bmessage")
    public Queue BMessage() {
        return new Queue("fanout.B",true);
    }
    @Bean(name="Cmessage")
    public Queue CMessage() {
        return new Queue("fanout.C",true);
    }
    @Bean
    public FanoutExchange fanoutExchange () {
        return new FanoutExchange(FANOUTEXCHANGE, true, false);
    }
   @Bean
   Binding bindingExchangeA(@Qualifier("Amessage") Queue AMessage,
                            FanoutExchange fanoutExchange) {
       return BindingBuilder.bind(AMessage).to(fanoutExchange);
   }
    @Bean
    Binding bindingExchangeB(@Qualifier("Bmessage") Queue BMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(BMessage).to(fanoutExchange);
    }
    @Bean
    Binding bindingExchangeC(@Qualifier("Cmessage") Queue CMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(CMessage).to(fanoutExchange);
    }
}
