import unittest
from bank_account import BankAccount

class TestBankOperations(unittest.TestCase):
    def test_insufficient_deposit(self):
        a = BankAccount(1)
        a.deposit(100)
        outcome = a.withdraw(200)
        self.assertFalse(outcome)
