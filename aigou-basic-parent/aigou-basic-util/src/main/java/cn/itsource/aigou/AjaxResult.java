package cn.itsource.aigou;

public class AjaxResult {
    private Boolean success = true;
    private String msg = "登录成功";

    public static AjaxResult me() {
        return new AjaxResult();
    }

    public AjaxResult() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
