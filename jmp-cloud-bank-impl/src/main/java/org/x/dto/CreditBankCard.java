package org.x.dto;

public class CreditBankCard extends BankCard {
  public CreditBankCard(User user) {
    super(user, BankCardType.CREDIT);
  }

}