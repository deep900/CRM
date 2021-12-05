/**
 * 
 */
package com.crm.notifications;

/**
 * Use this class for formatting emails / SMS before sending email or SMS notifications.
 * 
 * @author Pradheep
 *
 */
public interface NotificationFormat {
	
	public String getFormatString(String inputFormat);
}
