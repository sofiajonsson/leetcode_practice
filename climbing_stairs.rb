def climb_stairs(n)
    res = [0, 1]
    n.times do
        res << (res[-1] + res[-2])
    end
    res.last
end

def climb_stairs(n)
    return 0 if n == 0
  a, b = 0, 1
  n.times { a, b = b, b + a }
  b
end
