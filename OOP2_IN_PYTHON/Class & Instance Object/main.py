class SoftwareEniner:
    #This is global attribute
    Company_Name = "GOOGlE"
    def __init__(self, name, age, level, salary):
        self.name=name
        self.age=age
        self.level=level
        self.salary=salary
    def work(self):
        print(f"{self.name} is working in a project")

person1 = SoftwareEniner("anik", 22, "fresher", 50000)
print(person1.name, person1.age, person1.level, person1.salary)
person1.work()
print(SoftwareEniner.Company_Name)