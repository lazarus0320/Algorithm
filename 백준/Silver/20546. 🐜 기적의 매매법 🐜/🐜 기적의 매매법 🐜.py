import sys
input = sys.stdin.readline
money = int(input())
jun_money = money
sung_money = money
stream = list(map(int, input().split()))
total_amount = 0

for s in stream:
  if jun_money >= s:
    amount = (jun_money // s) # 매수 가능 주식 수 만큼 추가
    jun_money -= (s * amount) # 매수 가능한 금액만큼 원금에서 차감
    total_amount += amount

jun_rate = jun_money + (stream[-1] * total_amount)

total_amount = 0
rising, down = 0, 0
for i in range(len(stream)):
  if stream[i-1] < stream[i]: # 3일 연속 전일대비 상승=> 전량 매도
    rising += 1
    down = 0
  elif stream[i-1] > stream[i]: # 3일 연속 전일대비 하락=> 전량 매수
    down += 1
    rising = 0
  else:
    rising, down = 0, 0
  
  if rising == 3: # 전량 매도
    sung_money += (total_amount * stream[i])
    total_amount = 0
    rising = 0

  
  elif down >= 3 and money > stream[i]: # 전량 매수
    amount = (sung_money // stream[i])
    sung_money -= (amount * stream[i])
    total_amount += amount
    

sung_rate = sung_money + (stream[-1] * total_amount)

if jun_rate > sung_rate:
  print("BNP")
elif jun_rate < sung_rate:
  print("TIMING")
else:
  print("SAMESAME")