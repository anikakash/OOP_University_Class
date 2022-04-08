class SoftwareEniner:
    #This is global attribute
    Company_Name = "GOOGlE"
    def __init__(self, name, age, level, salary):
        self.name=name
        self.age=age
        self.level=level
        self.salary=salary
    def work(self, programming_language):
        print(f"{self.name} is coding in {programming_language}")

    # with return value
    def information(self):
        information=f"name = {self.name}, age = {self.age}, level = {self.level}"
        return information

person1 = SoftwareEniner("anik", 22, "fresher", 50000)
print(person1.name, person1.age, person1.level, person1.salary)
person1.work("Python")
print(SoftwareEniner.Company_Name)

print((person1.information()))