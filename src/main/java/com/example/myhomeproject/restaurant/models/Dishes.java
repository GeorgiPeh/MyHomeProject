package com.example.myhomeproject.restaurant.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Dishes")
public class Dishes
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long   id;
  @Column
  @NotNull
  private String dishesName;
  @Column
  @NotNull
  private double deliveryPrice;
  @Column
  @NotNull
  private double dishesPrice;

  private enum TypeOfFood
  {
    REGULAR,
    VEGAN,
    VEGETARIAN
  }

  private enum typeOfDishes
  {
    SALAD,
    PIZZA,
    DESERT,

  }
}
