package com.jachs.rest.entity.oto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author zhanchaohan
 * 学生卡对象被关联对象
 */
@Data
@Entity
@Table(name="StudentCard")
public class StudentCard {
    @Id
    private String CardId;
    @Column(name = "CardType")
    private String CardType;
    @Column(name = "CardMonery")
    private Long CardMonery;
    
}
