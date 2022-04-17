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



# polymorphism

employee_list = [SoftwareEniner("Anik", 22, 50000, "Fresher"),
            SoftwareEniner("Akash", 22, 50000, "Student"),
            Designer("Arpita", 22, 50000, "Student")]


# HR Department

def motivate_employee(all_employee):
    for suru in all_employee:
        suru.work()


motivate_employee(employee_list)

