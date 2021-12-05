/**
 * 
 */
package com.crm.notifications;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Setter
@Getter
public class Notification {
	
	public NotificationType notificationType;
	
	public String message;
	
	public String title;
}
