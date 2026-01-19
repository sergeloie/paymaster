package ru.anseranser.paymaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "operations")
@EntityListeners(AuditingEntityListener.class)
@ToString
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Exclude
    private Long id;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "cost")
    private Integer cost;

    @CreatedDate
    @Column(name = "created_date")
    private Instant createdDate;
}
