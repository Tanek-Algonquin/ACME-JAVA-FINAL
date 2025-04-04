/********************************************************************************************************
 * File:  PojoListener.java Course Materials CST 8277
 *
 * @author Teddy Yap
 * @author Shariar (Shawn) Emami
 * @author Suhas Udayakumar, Tanek Stuttgraham, Sukhpreet Singh
 */
package acmemedical.entity;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@SuppressWarnings("unused")

public class PojoListener {

	@PrePersist
	public void setCreatedOnDate(PojoBase pojoBase) {
		LocalDateTime now = LocalDateTime.now();
		pojoBase.setCreated(now);
		}

	@PrePersist
	public void setUpdatedDate(PojoBase pojoBase) {
		LocalDateTime updatedNow = LocalDateTime.now();
		pojoBase.setUpdated(updatedNow);
		}

}
