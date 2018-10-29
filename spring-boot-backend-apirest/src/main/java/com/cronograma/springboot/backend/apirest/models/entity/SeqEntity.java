package com.cronograma.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_seq")
@SequenceGenerator(name= "NAME_SEQUENCE", sequenceName = "SEQ_ID", initialValue=1, allocationSize = 1)
public class SeqEntity implements Serializable {
  private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NAME_SEQUENCE")
 private Long id;

}