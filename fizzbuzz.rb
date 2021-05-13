def fizz_buzz(n)
   (1..n).map do |num|
        if (num % 15).zero? then "FizzBuzz"
        elsif (num % 3).zero? then "Fizz"
        elsif (num % 5).zero? then "Buzz"
        else num.to_s
        end
    end
end

def fizz_buzz(n)
    1.upto(n).map{ |i| i % 15 == 0 ? 'FizzBuzz' : i % 3 == 0 ? 'Fizz' : i % 5 == 0 ? 'Buzz' : i.to_s }
end
