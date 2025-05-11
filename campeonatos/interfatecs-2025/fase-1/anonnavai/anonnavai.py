bolas = int(input())

for i in range(bolas):
    do = int(input())
    da = int(input())

    if(do > da and do+da > 40):
        print("DOROTHY DECIDE E A NONNA VAI")
    elif (do > da and do+da <= 40):
        print("DOROTHY DECIDE")
    elif(da > do and do+da > 40):
        print("DAGMAR DECIDE E A NONNA VAI")
    elif (da > do and do+da <= 40):
        print("DAGMAR DECIDE")