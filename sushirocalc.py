red = float(input('Red plate = '))
silver = float(input('Silver plate = '))
gold = float(input('Gold plate = '))
black = float(input('Black plate = '))
drink = input('Refill? = ')

final = ((red * 40) + (silver * 60) + (gold * 80) + (black * 120)) * 1.1
print(final)