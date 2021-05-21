def my_sqrt(x)
 Math.sqrt(x).truncate
end


# binary search
def my_sqrt(x)
  return x if x < 2

  p1  = 1
  p2  = x
  mid = 0

  while true do
    mid = (p1+p2)/2

    return p1 if p1 == mid
    return p2 if p2 == mid
    return mid if mid*mid == x

    p2 = mid if mid*mid > x
    p1 = mid if mid*mid < x
  end
  nil
end
