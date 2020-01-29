package com.Leads.bankservice.rabbitmqlistener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Leads.bankservice.customerservice.CustomerLedger;
import com.Leads.bankservice.model.BankLedger;
import com.Leads.bankservice.service.BankLedgerService;


@Component
public class RabbitMQListener {
	
	//@Autowired
	//private BankLedger bankLedger;
	
	@Autowired
	private BankLedgerService bankLedgerService;
	
	@RabbitListener(queues = "${queue.rabbitmq.queue}")
	public void recievedMessage(CustomerLedger customerLedger) {
		
		
		if(customerLedger.getTransactionType().equals("Debit") ||customerLedger.getTransactionType().equals("Credit")) {
			BankLedger bankLedger=new BankLedger();
			bankLedger.setBankId(001);
			if(customerLedger.getTransactionType().equals("Debit")) {
				bankLedger.setTransactionType("Credit");
				
			}
			else {
				bankLedger.setTransactionType("Debit");
			}
			bankLedger.setAmount(customerLedger.getAmount());
			bankLedger.setBatchId(customerLedger.getBatchId());
			bankLedger.setTransactionId(customerLedger.getTransactionId());
			bankLedger.setTransactionDate(customerLedger.getTransactionDate());
			
			bankLedgerService.addToBankLedger(bankLedger,customerLedger);
			//System.out.println(bankLedger.getBankId()+"batch:  "+bankLedger.getBatchId()+" ");
		}
		
	}	 
}
//}
