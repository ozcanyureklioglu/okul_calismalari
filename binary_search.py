"""
24 January 2019
author Özcan Yüreklioğlu
"""
#This code is binary search
def binary_search(data, target, low, high):
  
  if low>high:
      return False
  else:
      mid=(low+high)//2
      if target==data[mid]:
          return True
      if target<data[mid]:
          return binary_search(data,target,low,mid-1)
      else:
          return binary_search(data,target,mid+1,high)
      
        
print(binary_search([2,3,4,6,7,9,10],6,2,10))