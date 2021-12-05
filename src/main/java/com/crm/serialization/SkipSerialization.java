/**
 * 
 */
package com.crm.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Pradheep
 *
 */
@Target (ElementType.FIELD)
public @interface SkipSerialization {

}
