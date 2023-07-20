package com.gmail.woosay333.springbootdemo.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private double cost;

    @ManyToMany
    @Cascade(CascadeType.ALL)
    @JoinTable
            (
                    name = "order_product",
                    joinColumns = @JoinColumn(name = "order_id"),
                    inverseJoinColumns = @JoinColumn(name = "product_id")
            )
    private List<Product> products;

}
