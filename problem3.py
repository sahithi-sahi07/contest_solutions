class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        
        n =len(sandwiches)
        i = 0
        while i < (len(students)):
            v = students[0]
            if v == sandwiches[0]:
                sandwiches.pop(0)
                students.pop(0)
                i = 0 
            else:
                k = students.pop(0)
                students.append(k)
                i += 1
        return len(students)
