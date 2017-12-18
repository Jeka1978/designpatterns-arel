package com.arel.never_use_switch;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MailDaoImpl implements MailDao {
    private Random random = new Random();
    public MailInfo getMailInfo() {
        return new MailInfo(random.nextInt(2)+1);
    }
}
