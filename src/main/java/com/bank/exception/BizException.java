package com.bank.exception;



/**
 * 基础的业务异常
 * 
 */
public class BizException extends RuntimeException {
    /**  */
    private static final long serialVersionUID = 1548927237783032449L;

    /**
     * 异常编码
     */
    private int               code;
    /**
     * 异常消息
     */
    private String            msg;

    private Object[]          replacement;

    public BizException(Throwable t, int code, String msg) {
        super(msg + "[" + code + "]", t);
        this.code = code;
        this.msg = msg;
    }

    public BizException(Throwable t, String msg) {
        super(msg + "[" + "1" + "]", t);
        this.code = 1;
        this.msg = msg;
    }

    public BizException(int code, String msg) {
        super(msg + "[" + code + "]");
        this.code = code;
        this.msg = msg;
    }

    public BizException(String msg) {
        super(msg);
        this.code = 1;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object[] getReplacement() {
        return replacement;
    }

    public void setReplacement(String... replacement) {
        this.replacement = replacement;
    }

}
