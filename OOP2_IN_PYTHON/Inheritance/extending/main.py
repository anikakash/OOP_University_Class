#inherits, extend, override

class Employee:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary
    def work(self):
        print(f"{self.name} is working...\n")

class SoftwareEniner(Employee):
    def __init__(self, name, age, salary, level):
        super().__init__(name, age, salary)
        self.level = level
    def work(self):
        print(f"{self.name} is Coding...\n")


class Designer(Employee):
    def __init__(self, name, age, salary, level):
        super().__init__(name, age, salary)
        self.level = level
    def work(self):
        print(f"{self.name} is Designing...\n")

# name = input()
# age = int(input())
# salary = int(input())
# position = input()
name, age, salary, position = input().split()
persona1 = SoftwareEniner(name, age, salary, position)

persona1.work()
print(f"Name is: {persona1.name}\nAge is: {persona1.age}\nSalary is: {persona1.salary}\nHis Position: {persona1.level}")
