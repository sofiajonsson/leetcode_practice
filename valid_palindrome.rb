def is_palindrome(s)
       s.gsub!(/[^a-zA-Z0-9]/,"")
    s.downcase!
    left = 0
    right = s.length - 1

    while (left < right) do
        return false unless s[left] == s[right]
        left += 1
        right -= 1
    end

    return true
end

def is_palindrome(s)
    s = s.downcase.gsub(/[^0-9a-z]+/i, '')
    s == s.reverse
end
