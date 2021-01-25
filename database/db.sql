create database TechbaseVN;

CREATE TABLE Position (
  Position_Code INT NOT NULL,
  Position_Name VARCHAR(45),
  PRIMARY KEY (Position_Code)
);

CREATE TABLE Team (
  Team_Code INT NOT NULL,
  Team_Name VARCHAR(45),
  Team_ProjectName VARCHAR(45),
  PRIMARY KEY (Team_Code)
);

CREATE TABLE Department (
  Department_Code INT NOT NULL,
  Department_Name VARCHAR(45),
  Department_Manager VARCHAR(45),
  Department_TeamNo INT,
  PRIMARY KEY (Department_Code),
  CONSTRAINT DepartmentTeamNo_FK FOREIGN KEY(Department_Code) REFERENCES Team(Team_Code)
);

CREATE TABLE Employee
(
	Employee_Code INT NOT NULL,
    Employee_Fullname VARCHAR(45),
    Employee_Gender BIT,
    Employee_Address VARCHAR(255),
    Employee_DateOfBirth DATE,
    Employee_PhoneNumber VARCHAR(45),
    Employee_TeamNo INT,
	PRIMARY KEY (Employee_Code),
	CONSTRAINT EmployeeTeamNo_FK FOREIGN KEY(Employee_Code) REFERENCES Team(Team_Code)
);

INSERT INTO Position (Position_Code, Position_Name)
VALUES ('1', 'CEO');

INSERT INTO Team (Team_Code, Team_Name, Team_ProjectName)
VALUES ('1', 'Java', 'Project A');
INSERT INTO Team (Team_Code, Team_Name, Team_ProjectName)
VALUES ('2', 'Android', 'Project B');
INSERT INTO Team (Team_Code, Team_Name, Team_ProjectName) 
VALUES ('3', '.Net', 'Project C');

INSERT INTO Department (Department_Code, Department_Name, Department_Manager,Department_TeamNo)
VALUES ('1', 'IT Network', 'Le Van A','1');
INSERT INTO Department (Department_Code, Department_Name, Department_Manager,Department_TeamNo)
VALUES ('2', 'Developer', 'Tran Thanh B','2');

INSERT INTO Employee (Employee_Code, Employee_Fullname, Employee_Gender,Employee_Address,Employee_DateOfBirth,Employee_PhoneNumber,Employee_TeamNo)
VALUES ('1', 'TranMinhTuan', 1, 'Huynh Van Banh','1995-10-19','0945548554','1');

select * from Position;
select * from Team;
select * from Department;
select * from Employee