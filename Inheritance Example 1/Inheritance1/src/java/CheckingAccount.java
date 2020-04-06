/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Najihah Zanudin
 */

class CheckingAccount extends Account
{
   CheckingAccount(long amount)
   {
      super("checking", amount);
   }

   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}