/**
 * 
 */
package com.crm.approvals;

/**
 * @author Pradheep
 *
 */
public interface ApprovalAction<T> {

	public void takeAction(T obj);
}
