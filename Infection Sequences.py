import math
from typing import List
from collections import deque
def getInfectionSequencesCount (n, infectedHouses):
  frontier_queue = deque()
  visit = set ()
  for infected house in infectedHouses:
    frontier_queue.append (infected_house)
    visit.add (infected_house)
  def add_house(_house: int):
    if house < 1 or _house > n or _house in visit:
      return
    frontier_queue.append(_house)
    visit.add (_house)
  level = 0
  cnt = 1
  while frontier_queue:
    for infected_house in range(len(frontier_ queue)):
      house = frontier_queue.popleft()
      visit.add (house)
      add_house(house-1)
      add_house(house+1)
    level +=1
  
    if level and len(frontier_ queue) > 1:
      cnt *= math.factorial(len(frontier_queue))
  return cnt % (10**9 + 7)
