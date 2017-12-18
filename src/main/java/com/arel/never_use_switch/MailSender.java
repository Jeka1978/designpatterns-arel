package com.arel.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    private MailDao dao = new MailDaoImpl();

    public void sendMail() {
        MailInfo mailInfo = dao.getMailInfo();
        switch (mailInfo.getMailCode()) {
            case 1:
                // 78 lines of code for building mail WELCOME
                System.out.println("Welcome new client");
                break;
            case 2:
                if (mailInfo.getMailCode() == 2) {
                    // 50 lines
                    System.out.println("don't call us we call you");
                }
                break;
        }
    }
}
