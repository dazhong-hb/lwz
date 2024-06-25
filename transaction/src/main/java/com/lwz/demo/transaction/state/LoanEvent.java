package com.lwz.demo.transaction.state;

/**
 * 支付事件
 */
public enum LoanEvent implements BaseEvent {

    // 支付创建
    PAY_CREATE("PAY_CREATE", "支付创建"),
    // 支付中
    PAY_PROCESS("PAY_PROCESS", "支付中"),
    // 支付成功
    PAY_SUCCESS("PAY_SUCCESS", "支付成功"),
    // 支付失败
    PAY_FAIL("PAY_FAIL", "支付失败");

    /**
     * 事件
     */
    private String event;

    /**
     * 事件描述
     */
    private String description;

    LoanEvent(String event, String description) {
        this.event = event;
        this.description = description;
    }

}