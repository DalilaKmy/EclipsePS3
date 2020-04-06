/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Najihah Zanudin
 */

class Account
{
   private String name;

   private long amount;

   Account(String name, long amount)
   {
      this.name = name;
      setAmount(amount);
   }

   void deposit(long amount)
   {
      this.amount += amount;
   }

   String getName()
   {
      return name;
   }

   long getAmount()
   {
      return amount;
   }

   void setAmount(long amount)
   {
      this.amount = amount;
   }
}