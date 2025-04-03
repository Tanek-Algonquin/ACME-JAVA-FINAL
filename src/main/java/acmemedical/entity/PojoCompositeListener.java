/********************************************************************************************************
 * File:  PojoCompositeListener.java Course Materials CST 8277
 *
 * @author Teddy Yap
 * @author Shariar (Shawn) Emami
 * 
 */
package acmemedical.entity;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@SuppressWarnings("unused")

public class PojoCompositeListener {

	@PrePersist
	public void setCreatedOnDate(PojoBaseCompositeKey<?> pojoBaseComposite) {
		LocalDateTime now = LocalDateTime.now();
		pojoBaseComposite.setCreated(now); 
		}

	@PrePersist
	public void setUpdatedDate(PojoBaseCompositeKey<?> pojoBaseComposite) {
		LocalDateTime nowUpated = LocalDateTime.now();
		pojoBaseComposite.setUpdated(nowUpated);
		}

}
