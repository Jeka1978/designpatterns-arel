package com.arel.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailInfo {
    private int mailCode;

    public MailInfo(int mailCode) {
        this.mailCode = mailCode;
    }

    public int getMailCode() {
        return mailCode;
    }

    public void setMailCode(int mailCode) {
        this.mailCode = mailCode;
    }

    @Override
    public String toString() {
        return "MailInfo{" +
                "mailCode=" + mailCode +
                '}';
    }
}
