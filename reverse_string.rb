def reverse_string(s)
    s.reverse!
end

def reverse_string(s)

  return true if s.size == 0
  left = 0
  right = s.size - 1

  while(left <= right) do
    s[left], s[right] = s[right], s[left]
    left += 1
    right -= 1
  end

end
