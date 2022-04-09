#inherits, extend, override

class Employee:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def work(self):
        print(f"{self.name} is working\n")

class SoftwareEniner(Employee):
    pass


class Designer(Employee):
    pass


persona1 = SoftwareEniner("anik", 22)
print(persona1.name, persona1.age)
persona2 = Designer("Akash", 22)
print(persona2.name, persona2.age)
persona1.work()
persona2.work()