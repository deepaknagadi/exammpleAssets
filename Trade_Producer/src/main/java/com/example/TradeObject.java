/**
 * 
 */
package com.example;


public class TradeObject {	

	private String tradeId;
	private String tradeMessageStatus;
	private String tradeDatetime;
	private String settlementStatus;
	private String settlementDateTime;
	
					
				public String getTradeId() {
					return tradeId;
				}
				public void setTradeId(String tradeId) {
					this.tradeId = tradeId;
				}
				public TradeObject() {
					
				}
				public String getTradeMessageStatus() {
					return tradeMessageStatus;
				}
				public void setTradeMessageStatus(String tradeMessageStatus) {
					this.tradeMessageStatus = tradeMessageStatus;
				}
				public String getTradeDatetime() {
					return tradeDatetime;
				}
				public void setTradeDatetime(String tradeDatetime) {
					this.tradeDatetime = tradeDatetime;
				}
				public String getSettlementStatus() {
					return settlementStatus;
				}
				public void setSettlementStatus(String settlementStatus) {
					this.settlementStatus = settlementStatus;
				}
				public String getSettlementDateTime() {
					return settlementDateTime;
				}
				public void setSettlementDateTime(String settlementDateTime) {
					this.settlementDateTime = settlementDateTime;
				}
				public TradeObject(String tradeId, String tradeMessageStatus, String tradeDatetime, String settlementStatus,
						String settlementDateTime) {
					super();
					this.tradeId = tradeId;
					this.tradeMessageStatus = tradeMessageStatus;
					this.tradeDatetime = tradeDatetime;
					this.settlementStatus = settlementStatus;
					this.settlementDateTime = settlementDateTime;
				}
				@Override
				public String toString() {
					return "TradeObject [tradeId=" + tradeId + ", tradeMessageStatus=" + tradeMessageStatus + ", tradeDatetime="
							+ tradeDatetime + ", settlementStatus=" + settlementStatus + ", settlementDateTime="
							+ settlementDateTime + "]";
				}				
	

}
