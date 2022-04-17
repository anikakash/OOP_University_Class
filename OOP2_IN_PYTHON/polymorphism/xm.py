student = []
n = int(input("Enter How many student: "))
def accept():
    for i in range(n):
        x = input("Enter The Student: ").split()
        student.append(x)

def display():
    for i in student:
        # for j in student:
        print(i)

def search():
    rol = int(input("Enter the student Roll: "))
    try:
        for i in range(rol):
            x = int(student[i][1])
            if x == rol:
                    # x = student[i][0],student[i][1],student[i][2],student[i][3]
                    # return x
                print(student[i][0],student[i][1],student[i][2],student[i][3])
    except Exception as e:
        # raise e
        print("Enter a valid input")

accept()
display()
search()
