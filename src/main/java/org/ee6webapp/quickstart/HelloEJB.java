package org.ee6webapp.quickstart;

import javax.ejb.Local;

/**
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
@Local
public interface HelloEJB {

	String sayHelloEJB(String string);
	
}
