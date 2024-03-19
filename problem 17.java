class Solution:
    def subArrayExists(self,arr,n):
        ##Your code here
        if arr[0]==0:
            return True
        for i in range(1,len(arr)):
            arr[i]+=arr[i-1]
            if arr[i]==0:
                return True
        li=dict()
        for i in range(0,len(arr)):
            if arr[i] in li.keys():
                return True
            else:
                li[arr[i]]=1
        return False    
