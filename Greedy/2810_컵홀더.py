N = input()
seat = input()
LL_num = seat.count("LL")
if LL_num == 0:
    print(len(seat))
else: print(len(seat)-LL_num+1)
