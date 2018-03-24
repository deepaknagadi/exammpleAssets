/**
 * 
 */
package com.example;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.UUID;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;


@EnableBinding(Source.class)

public class TradeProducer {
	

	  @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "7000", maxMessagesPerPoll = "1"))
	    public TradeObject timerMessageSource() {
		  
		  
		  String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		  
		  TradeObject tradeObject = new TradeObject();
		    
	    
	  	  String tradeNumber = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
	    
	      //System.out.println(tradeNumber);
	  	    
		  tradeObject.setTradeId(tradeNumber); 
		  Random rand = new Random();        
	      int randint = rand.nextInt(100000);
		  
		  if	  (randint % 3 == 0) {		  
				  tradeObject.setTradeMessageStatus("SENT");
				  tradeObject.setSettlementStatus("YES");
		  }
		  else if (randint % 4 == 0) {
				  tradeObject.setTradeMessageStatus("REVIEW");
				  tradeObject.setSettlementStatus("NO");			  
		  }		  
		  else {		
				  tradeObject.setTradeMessageStatus("ERROR");
				  tradeObject.setSettlementStatus("NOT AVAILABLE");				  
		  }
				  tradeObject.setTradeDatetime(timeStamp);
				  tradeObject.setSettlementDateTime(timeStamp);
				  
		  	System.out.println(tradeObject.toString());
		  	  
		  	return tradeObject;
	    }

	  
	
	
	

}
