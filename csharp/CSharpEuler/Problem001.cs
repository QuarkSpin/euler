using System.Linq;

namespace CSharpEuler
{
    public class Problem001 : ISolvable<int>
    {
        public int Solve() => Enumerable.Range(1, 999).Where(x => x % 3 == 0 || x % 5 == 0).Sum();
    }
}
